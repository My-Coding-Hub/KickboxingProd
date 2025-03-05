package kickboxing.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/");

        // Adiciona o handler para o diretório de imagens dos patrocinadores
        registry.addResourceHandler("/upload/patrocinadores/**")
                .addResourceLocations("file:" + System.getProperty("catalina.base") + "/webapps/upload/patrocinadores/");

        registry.addResourceHandler("/upload/academias/**")
                .addResourceLocations("file:" + System.getProperty("catalina.base") + "/webapps/upload/academias/");

        registry.addResourceHandler("/upload/eventos/**")
                .addResourceLocations("file:" + System.getProperty("catalina.base") + "/webapps/upload/eventos/");

        registry.addResourceHandler("/upload/alunos/**")
                .addResourceLocations("file:" + System.getProperty("catalina.base") + "/webapps/upload/alunos/");

        registry.addResourceHandler("/upload/professores/**")
                .addResourceLocations("file:" + System.getProperty("catalina.base") + "/webapps/upload/professores/");
    }
}