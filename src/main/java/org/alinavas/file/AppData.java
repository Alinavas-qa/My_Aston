package org.alinavas.file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppData {
    private String[] header;
    private int[][] data;

    // Метод для сохранения данных в CSV файл
    public void save(String filename) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Запись заголовка
            if (header != null) {
                writer.write(String.join(";", header));
                writer.newLine();
            }
            
            // Запись данных
            if (data != null) {
                for (int[] row : data) {
                    StringBuilder rowString = new StringBuilder();
                    for (int value : row) {
                        rowString.append(value).append(";");
                    }
                    // Убираем последний разделитель
                    rowString.setLength(rowString.length() - 1);
                    writer.write(rowString.toString());
                    writer.newLine();
                }
            }
        }
    }

    // Метод для загрузки данных из CSV файла
    public void load(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            // Чтение заголовка
            String line = reader.readLine();
            if (line != null) {
                header = line.split(";");
            }

            List<int[]> dataList = new ArrayList<>();
            // Чтение данных
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(";");
                int[] intValues = new int[values.length];
                for (int i = 0; i < values.length; i++) {
                    intValues[i] = Integer.parseInt(values[i].trim());
                }
                dataList.add(intValues);
            }

            // Преобразование списка в массив
            data = new int[dataList.size()][];
            dataList.toArray(data);
        }
    }

    // Геттеры и сеттеры
    public String[] getHeader() {
        return header;
    }

    public void setHeader(String[] header) {
        this.header = header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }

    public static void main(String[] args) {
        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value1", "Value2", "Value3"});
        appData.setData(new int[][]{{100, 200, 123}, {300, 400, 500}});

        try {
            // Сохранение данных в CSV
            appData.save("data.csv");
            System.out.println("Данные сохранены в data.csv");

            // Создание нового объекта для загрузки данных
            AppData loadedData = new AppData();
            loadedData.load("data.csv");
            System.out.println("Данные загружены:");
            System.out.println("Заголовок: " + String.join(", ", loadedData.getHeader()));
            for (int[] row : loadedData.getData()) {
                System.out.println("Строка: " + java.util.Arrays.toString(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
