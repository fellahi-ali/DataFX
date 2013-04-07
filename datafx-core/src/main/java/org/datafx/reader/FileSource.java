package org.datafx.reader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.datafx.reader.converter.InputStreamConverter;
import org.datafx.reader.converter.XmlConverter;

/**
 *
 * @author johan
 */
public class FileSource<T> extends InputStreamDataReader<T> {

  //  private InputStream is;
    private InputStreamConverter<T> converter;

    /**
     * Create a FileSource based on an existing file. By default, it is assumed
     * the input format is XML. Use FileSource (String, Converter) to specify a
     * different format.
     *
     * @param filename the filename
     * @throws FileNotFoundException
     */
//    public FileSource(String filename, Class<T> clazz) throws FileNotFoundException {
//        this(filename, new XmlConverter<T>("", clazz), clazz);
//    }

    /**
     * Create a FileSource based on an existing file. By default, it is assumed
     * the input format is XML. Use FileSource (String, Format) to specify a
     * different format.
     *
     * @param filename the filename
     * @throws FileNotFoundException
     */
    public FileSource(File f) throws FileNotFoundException {
        this(f, new XmlConverter<T>("", null));
    }

    /**
     * Create a FileSource based on an existing inputstream. By default, it is
     * assumed the input format is XML. Use FileSource (String, Format) to
     * specify a different format.
     *
     * @param filename the filename
     * @throws FileNotFoundException
     */
//    public FileSource(InputStream is, Class clazz) {
//        this(is, Format.XML, clazz);
//    }

    /**
     * Create a FileSource based on an existing file.
     *
     * @param filename the filename
     * @param format the format of the data
     * @throws FileNotFoundException
     */
//    public FileSource(String filename, Format format, Class clazz) throws FileNotFoundException {
//        this.is = new FileInputStream(filename);
//        this.format = format;
//        this.clazz = clazz;
//    }

    /**
     * Create a FileSource based on an existing file.
     *
     * @param f the file
     * @param format the format of the data
     * @throws FileNotFoundException
     */
    public FileSource(File f, InputStreamConverter<T> converter) throws FileNotFoundException {
        super(new FileInputStream(f), converter);
    }

    /**
     * Create a FileSource based on an existing inputstream.
     *
     * @param filename the filename
     * @param format the format of the data
     * @throws FileNotFoundException
     */
//    public FileSource(InputStream is, Format format, Class clazz) {
//        this.is = is;
//        this.format = format;
//        this.clazz = clazz;
//    }
    
}
