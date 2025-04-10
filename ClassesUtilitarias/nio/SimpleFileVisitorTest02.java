package ClassesUtilitarias.nio;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor{
    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs){
        System.out.println(((Path) file).getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre visit " + ((Path) dir).getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
        System.out.println("post visit " + ((Path) dir).getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get("pasta");
        Files.walkFileTree(root, new ListAllFiles());
    }
}
