package com.tecnm.itics.proyecto.oxxo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public final class ObjectsFileHandler {

    // Private constructor to prevent instantiation
    private ObjectsFileHandler() {
        throw new AssertionError("Cannot instantiate utility class");
    }

    /**
     * Type-safe method to write serializable objects to binary file
     * @param relativePath Target file path (relative)
     * @param object Serializable object to write
     * @param <T> Type parameter bounded by Serializable
     * @throws IOException If serialization fails
     */
    public static <T extends Serializable> void writeBinaryFile(String relativePath, T object)
            throws IOException {

        Path path = Paths.get(relativePath);
        Files.createDirectories(path.getParent());

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(Files.newOutputStream(path)))) {
            oos.writeObject(object);
        }
    }

    /**
     * Type-safe method to read serialized objects from binary file
     * @param relativePath Source file path (relative)
     * @param type Class reference for type safety
     * @param <T> Expected return type
     * @return Deserialized object of specified type
     * @throws IOException If deserialization fails
     * @throws ClassNotFoundException If class mismatch occurs
     */
    public static <T extends Serializable> T readBinaryFile(String relativePath, Class<T> type)
            throws IOException, ClassNotFoundException {

        Path path = Paths.get(relativePath);
        try (ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(Files.newInputStream(path)))) {
            Object obj = ois.readObject();
            return type.cast(obj);
        }
    }
}
