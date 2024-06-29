package mod.ckenja.karacreate;

import net.minecraft.client.model.geom.ModelLayerLocation;

public class KaraCreateModelLayers {
    public static final ModelLayerLocation PAPER_DOOR = register("paper_door");

    private static ModelLayerLocation register(String part) {
        return new ModelLayerLocation(KaraCreate.asResource("main"), part);
    }
}
