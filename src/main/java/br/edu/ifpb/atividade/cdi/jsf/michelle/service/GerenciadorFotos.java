
package br.edu.ifpb.atividade.cdi.jsf.michelle.service;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import javax.servlet.http.Part;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 09/10/2017
 */

public class GerenciadorFotos {
    
    private static final String PATHNAME = "";

    public static String encodeFoto(Part foto) throws IOException {
        byte[] bytes = new byte[(int)foto.getSize()];
        new BufferedInputStream(foto.getInputStream()).read(bytes);

        String fotoBase64 = Base64.getEncoder().encodeToString(bytes);
        return fotoBase64;
    }

    public static File decodeFoto(String fotoBase64) throws IOException {
        byte[] fotoBytes = Base64.getDecoder().decode(fotoBase64);

        new FileOutputStream((PATHNAME) + fotoBase64.hashCode()+".jpg").write(fotoBytes);

        File foto = new File(PATHNAME + fotoBase64.hashCode());
        return foto;
    }
}
