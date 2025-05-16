class PaintBrush {
    String brand;
    String type;
    String bristleMaterial;
    int bristleLength;
    int brushWidth;
    boolean isSynthetic;
    boolean isWashable;
    boolean hasErgonomicHandle;
    String handleMaterial;
    String color;
    boolean isForWatercolor;
    boolean isForOilPaint;
    boolean isForAcrylic;
    boolean isForGouache;
    int durability;
    String suitableSurface;
    boolean hasReplaceableHeads;
    double price;
    String countryOfOrigin;

    public PaintBrush(String brand, String type, String bristleMaterial, int bristleLength, int brushWidth,
                      boolean isSynthetic, boolean isWashable, boolean hasErgonomicHandle, String handleMaterial,
                      String color, boolean isForWatercolor, boolean isForOilPaint, boolean isForAcrylic,
                      boolean isForGouache, int durability, String suitableSurface, boolean hasReplaceableHeads,
                      double price, String countryOfOrigin) {
        this.brand = brand;
        this.type = type;
        this.bristleMaterial = bristleMaterial;
        this.bristleLength = bristleLength;
        this.brushWidth = brushWidth;
        this.isSynthetic = isSynthetic;
        this.isWashable = isWashable;
        this.hasErgonomicHandle = hasErgonomicHandle;
        this.handleMaterial = handleMaterial;
        this.color = color;
        this.isForWatercolor = isForWatercolor;
        this.isForOilPaint = isForOilPaint;
        this.isForAcrylic = isForAcrylic;
        this.isForGouache = isForGouache;
        this.durability = durability;
        this.suitableSurface = suitableSurface;
        this.hasReplaceableHeads = hasReplaceableHeads;
        this.price = price;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void display() {
        System.out.println("PaintBrush Brand is\t"+brand);
        System.out.println("Type is\t"+type);
        System.out.println("Bristle Material is\t"+bristleMaterial);
        System.out.println("Bristle Length is\t"+bristleLength);
        System.out.println("Brush Width is\t"+brushWidth);
        System.out.println("Is Synthetic is\t"+isSynthetic);
        System.out.println("Is Washable is\t"+isWashable);
        System.out.println("Has Ergonomic Handle is\t"+hasErgonomicHandle);
        System.out.println("Handle Material is\t"+handleMaterial);
        System.out.println("Color is\t"+color);
        System.out.println("For Watercolor is\t"+isForWatercolor);
        System.out.println("For Oil Paint is\t"+isForOilPaint);
        System.out.println("For Acrylic is\t"+isForAcrylic);
        System.out.println("For Gouache is\t"+isForGouache);
        System.out.println("Durability is\t"+durability);
        System.out.println("Suitable Surface is\t"+suitableSurface);
        System.out.println("Has Replaceable Heads is\t"+hasReplaceableHeads);
        System.out.println("Price is\t"+price);
        System.out.println("Country of Origin is\t"+countryOfOrigin);
        System.out.println("\n");
    }
}
