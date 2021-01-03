package stringmethods.url;

public class UrlManager {
    private String protocol;
    private Integer port;
    private String host;
    private String path = "";
    private String query = "";

    public UrlManager(String url) {
        url = url.trim();
        if (!urlIsValid(url)) {
            throw new IllegalArgumentException("Invalid url");
        }
        protocol = url.substring(0, url.indexOf("://")).toLowerCase();
        host = url.substring(url.indexOf("://") + 3);
        if (host.contains("/")) {
            path = host.substring(host.indexOf("/"));
            host = host.substring(0, host.indexOf("/"));
            if (path.contains("?")) {
                query = path.substring(path.indexOf("?") + 1);
                path = path.substring(0, path.indexOf("?"));
            }
        }
        if (host.contains(":")) {
            port = Integer.parseInt(host.substring(host.indexOf(":") + 1));
            host = host.substring(0, host.indexOf(":"));
        }
        host = host.toLowerCase();
    }

    public String getProtocol() {
        return protocol;
    }

    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    public String getProperty(String property) {
        String prop = null;
        if (hasProperty(property)) {
            prop = query.substring(query.indexOf(property) + property.length() + 1);
            if (prop.contains("&")) {
                prop = prop.substring(0, prop.indexOf("&"));
            }
        }
        return prop;
    }

    public boolean urlIsValid(String url) {
        if (url == null || url.isBlank() || url.indexOf("://") < 1 || url.indexOf("://") + 3 >= url.length()) {
            return false;
        }
        return true;
    }

    public boolean hasProperty(String property) {
        if (query == null || query.isBlank() || property == null || property.isBlank()) {
            throw new IllegalArgumentException();
        }
        if (query.contains(property) && (query.indexOf(property) == 0 || "&".equals(query.charAt(query.indexOf(property) - 1)))) {
            return true;
        }
        return false;
    }
}
