package stringmethods.filename;

public class FileNameManipulator {

    public char findLastCharacter(String str) {
        if (isEmpty(str)) {
            throw new IllegalArgumentException("Empty string!");
        }

        str = str.trim();

        return str.charAt(str.length() - 1);
    }

    public String findFileExtension(String fileName) {
        if (isInvalidFileName(fileName)) {
            throw new IllegalArgumentException("Invalid file name!");
        }

        fileName = fileName.trim();

        return fileName.substring(fileName.lastIndexOf('.'));
    }

    public boolean identifyFilesByExtension(String ext, String fileName) {
        if (isInvalidFileName(fileName) || isEmpty(ext)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        ext = ext.trim();
        fileName = fileName.trim();

        return fileName.endsWith(ext);
    }

    public boolean compareFilesByName(String searchedFileName, String actualFileName) {
        if (isInvalidFileName(searchedFileName) || isInvalidFileName(actualFileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        searchedFileName = searchedFileName.trim();
        actualFileName = actualFileName.trim();

        return searchedFileName.equalsIgnoreCase(actualFileName);
    }

    public String changeExtensionToLowerCase(String fileName) {
        if (isEmpty(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }

        if (isInvalidFileName(fileName)) {
            throw new IllegalArgumentException("Invalid argument!");
        }

        fileName = fileName.trim();

        return  fileName.substring(0, fileName.lastIndexOf('.')) + findFileExtension(fileName).toLowerCase();
    }

    public String replaceStringPart(String fileName, String present, String target) {
        if (isInvalidFileName(fileName)) {
            throw new IllegalArgumentException("Empty string!");
        }

        fileName = fileName.trim();

        if (fileName.contains(present)) {
            return fileName.replace(present, target);
        }
        return fileName;
    }

    private boolean isEmpty(String string) {
        return (string == null || string.isBlank()) ? true : false;
    }

    private boolean isInvalidFileName(String fileName) {
        return (isEmpty(fileName) || fileName.lastIndexOf(".") < 1
               || fileName.lastIndexOf(".") > fileName.length() - 2) ? true : false;
    }
}
