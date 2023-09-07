package com.lojc.swagger.bean;

/*
 *@Auther Lojc
 *@Date 2023/9/8
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "swagger")        //! 只要在application.yml中设置带有前缀swagger就可以使配置生效
public class SwaggerInfo {

    private String basePackage;

    private String title;

    private String contactName;

    private String email;

    private String version;

    private String description;

    private String ContactUrl;

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactUrl() {
        return ContactUrl;
    }

    public void setContactUrl(String contactUrl) {
        ContactUrl = contactUrl;
    }
}
