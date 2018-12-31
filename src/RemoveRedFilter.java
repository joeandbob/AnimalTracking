public class RemoveRedFilter implements PixelFilter {

    @Override
    public DImage filter(DImage img) {
        DImage.ColorComponents2d channels = img.getColorChannels();

        for (int r = 0; r < img.getHeight(); r++) {
            for (int c = 0; c < img.getWidth(); c++) {
                channels.red[r][c] = 0;         // set all pixels in red channel to 0
            }
        }

        img.setColorChannels(channels);
        return img;
    }
}