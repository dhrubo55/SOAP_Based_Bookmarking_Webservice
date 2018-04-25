package com.dhrubo;
public class bookmarks {
  private Long id;
  private String name;
  private String url;
  private String tag;

  public bookmarks() {
    super();
  }

  public bookmarks(Long id, String name, String url, String tag) {
    super();
    this.id = id;
    this.name = name;
    this.url = url;
    this.tag = tag;
  }

  public bookmarks(String name, String url) {
    super();
    this.name = name;
    this.url= url;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url =url;
  }
    public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  @Override
  public String toString() {
    return String.format("bookmarks [id=%s, name=%s, url=%s, tag=%s]", id, name, url,tag);
  }

}