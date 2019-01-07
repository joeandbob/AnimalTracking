import processing.core.PApplet;

public class DoNothingFilter implements PixelFilter {

    @Override
    public DImage processImage(DImage img) {
        // we don't change the input image at all!
        return img;
    }

    @Override
    public void drawOverlay(PApplet window, DImage original, DImage filtered) {

    }

    public void drawOverlay(PApplet window) {
        window.fill(255, 0, 0);
        window.ellipse(0, 0, 10, 10);
    }
}