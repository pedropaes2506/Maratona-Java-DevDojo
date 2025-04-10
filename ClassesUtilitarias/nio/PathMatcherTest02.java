package ClassesUtilitarias.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

class ListFiles extends SimpleFileVisitor{
    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs){
        boolean matchFound = matches((Path) file, "glob:**/*Test*.{java,class}");
        if (matchFound) {
            System.out.println(((Path) file).getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    private boolean matches(Path path, String glob) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        return matcher.matches(path);
    }
}



public class PathMatcherTest02 {
    public static void main(String[] args) throws IOException {
        Path root = Paths.get(".");
        Files.walkFileTree(root, new ListFiles());
    }

    
}
