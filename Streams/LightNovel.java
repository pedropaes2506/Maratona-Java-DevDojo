package Streams;

public class LightNovel {
    private String title;
    private Double price;
    private Category category;
    
    public LightNovel(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, Double price, Category category) {
        this.title = title;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "LightNovel [title=" + title + ", price=" + price + ", category=" + category + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        LightNovel other = (LightNovel) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else if (!title.equals(other.title))
            return false;
        return true;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
