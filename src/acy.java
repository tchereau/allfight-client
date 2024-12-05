import java.util.List;

public class acy extends abr {
   public acy(int var1) {
      super(var1);
      this.y = 1;
      this.a(acn.void);
   }

   public abp a(abp var1, y6 var2, aek var3) {
      float var4 = 1.0F;
      float var5 = var3.a0 + (var3.a4 - var3.a0) * var4;
      float var6 = var3.a2 + (var3.a5 - var3.a2) * var4;
      double var7 = var3.ao + (var3.al - var3.ao) * (double)var4;
      double var9 = var3.an + (var3.ak - var3.an) * (double)var4 + 1.62D - (double)var3.aQ;
      double var11 = var3.am + (var3.aj - var3.am) * (double)var4;
      nr var13 = var2.do().a(var7, var9, var11);
      float var14 = ajs.for(-var6 * 0.017453292F - 3.1415927F);
      float var15 = ajs.try(-var6 * 0.017453292F - 3.1415927F);
      float var16 = -ajs.for(-var5 * 0.017453292F);
      float var17 = ajs.try(-var5 * 0.017453292F);
      float var18 = var15 * var16;
      float var20 = var14 * var16;
      double var21 = 5.0D;
      nr var23 = var13.a((double)var18 * var21, (double)var17 * var21, (double)var20 * var21);
      nt var24 = var2.a(var13, var23, true);
      if (var24 == null) {
         return var1;
      } else {
         nr var25 = var3.b(var4);
         boolean var26 = false;
         float var27 = 1.0F;
         List var28 = var2.a((aiw)var3, (nw)var3.aZ.a(var25.int * var21, var25.for * var21, var25.do * var21).do((double)var27, (double)var27, (double)var27));

         int var29;
         for(var29 = 0; var29 < var28.size(); ++var29) {
            aiw var30 = (aiw)var28.get(var29);
            if (var30.aw()) {
               float var31 = var30.P();
               nw var32 = var30.aZ.do((double)var31, (double)var31, (double)var31);
               if (var32.for(var13)) {
                  var26 = true;
               }
            }
         }

         if (var26) {
            return var1;
         } else {
            if (var24.if == ns.if) {
               var29 = var24.a;
               int var33 = var24.try;
               int var34 = var24.new;
               if (var2.new(var29, var33, var34) == pa.ca.void) {
                  --var33;
               }

               afm var35 = new afm(var2, (double)((float)var29 + 0.5F), (double)((float)var33 + 1.0F), (double)((float)var34 + 0.5F));
               var35.a5 = (float)(((ajs.a((double)(var3.a5 * 4.0F / 360.0F) + 0.5D) & 3) - 1) * 90);
               if (!var2.if((aiw)var35, (nw)var35.aZ.do(-0.1D, -0.1D, -0.1D)).isEmpty()) {
                  return var1;
               }

               if (!var2.goto) {
                  var2.new(var35);
               }

               if (!var3.fY.new) {
                  --var1.if;
               }
            }

            return var1;
         }
      }
   }
}
