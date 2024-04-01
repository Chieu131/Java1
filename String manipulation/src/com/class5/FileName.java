package com.class5;

public class FileName {
    /**
     * Variable contain value of path
     */
    private String fullPath;
    /**
     * Variable contain value of extension separator
     */
    private char extensionSeparator;
    /**
     * Variable contain value of disk separator
     */
    private char diskSparator;
    /**
     * Variable contain value of path separator
     */
    private char pathSeparator;

    /**
     * Contructor
     *
     * @param fullPath
     *            value of path
     * @param diskSparator
     *            value of disk separator
     * @param pathSeparator
     *            value of path separator
     * @param extensionSeparator
     *            value of extension separator
     */
    public FileName(String fullPath, char diskSparator, char pathSeparator,
                    char extensionSeparator) {
        // Write code here
        this.fullPath = fullPath;
        this.diskSparator = diskSparator;
        this.pathSeparator = pathSeparator;
        this.extensionSeparator = extensionSeparator;
    }

    /**
     * @return Extension
     */
    public String getExtension() {
        // Write code here
        String fileName = this.getFilename();
        int dotPosition = fileName.lastIndexOf('.');
        return fileName.substring(dotPosition + 1);
    }

    /**
     * @return file name without extension
     */
    public String getFilename() {
        // Write code here
        int position = this.fullPath.lastIndexOf(this.pathSeparator);
        return this.fullPath.substring(position + 1);
    }

    /**
     * @return path without filename
     */
    public String getPath() {
        // Write code here
        return this.fullPath;
    }

    /**
     * @return Disk name
     */
    public String getDisk() {
        // Write code here
        return this.fullPath.charAt(0) + "";
    }

    /**
     * @return all folder in path
     */
    public String[] getFolders() {
        // Write code here
        return this.fullPath.split("\\\\");
    }
}