package com.tecnm.morelia.itics.poo.u6.files.bags;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

    public final class FileHandler {

        private FileHandler() {} // Utility class

        /**
         * Reads a text file using try-with-resources
         * @param relativePath File path relative to working directory
         * @return List of file lines
         * @throws IOException If read fails
         */
        public static List<String> readTextFile(String relativePath) throws IOException {
            Path path = Paths.get(relativePath);
            if (!Files.exists(path)) {
                return new ArrayList<>();
            }

            try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
                List<String> lines = new ArrayList<>();
                String line;
                while ((line = reader.readLine()) != null) {
                    lines.add(line);
                }
                return lines;
            }
        }

        /**
         * Writes to a text file using try-with-resources
         * @param relativePath File path relative to working directory
         * @param content Lines to write
         * @throws IOException If write fails
         */
        public static void writeTextFile(String relativePath, List<String> content) throws IOException {
            Path path = Paths.get(relativePath);
            Files.createDirectories(path.getParent());

            try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
                for (String line : content) {
                    writer.write(line);
                    writer.newLine(); // Proper line separation
                }
            }
        }

        /**
         * Reads binary file using try-with-resources
         * @param relativePath File path relative to working directory
         * @return Byte array of file contents
         * @throws IOException If read fails
         */
        public static byte[] readBinaryFile(String relativePath) throws IOException {
            Path path = Paths.get(relativePath);
            try (InputStream is = new BufferedInputStream(Files.newInputStream(path))) {
                return is.readAllBytes(); // Java 9+ method
            }
        }

        /**
         * Writes binary file using try-with-resources
         * @param relativePath File path relative to working directory
         * @param data Byte array to write
         * @throws IOException If write fails
         */
        public static void writeBinaryFile(String relativePath, byte[] data) throws IOException {
            Path path = Paths.get(relativePath);
            Files.createDirectories(path.getParent());

            try (OutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
                os.write(data);
                os.flush(); // Ensure all bytes are written
            }
        }




    }

