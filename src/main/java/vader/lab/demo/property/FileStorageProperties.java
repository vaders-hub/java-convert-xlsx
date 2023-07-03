package vader.lab.demo.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {
    private String uploadDir;

//    public String getUploadDir() {
//        return uploadDir;
//    }
//
//    public void setUploadDir(String uploadDir) {
//        this.uploadDir = uploadDir;
//    }
}
