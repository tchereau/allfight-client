import net.minecraft.client.Minecraft;

public class g4 extends dh {
   private Minecraft an;

   public g4(Minecraft var1) {
      super(var1);
      this.an = var1;
   }

   public void if(float var1) {
      super.if(var1);
      ModLoader.a(var1, this.an);
   }
}
