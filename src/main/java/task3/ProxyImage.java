package task3;

public class ProxyImage implements MyImage {
    RealImage realImage;
    String filename;

    public ProxyImage(String filepath) {
        this.filename = filepath;
    }

    @Override
    public void display() {
        if (realImage == null)
            this.realImage = new RealImage(this.filename);
        this.realImage.display();
    }
}
