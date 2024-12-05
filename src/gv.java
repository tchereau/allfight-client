import java.net.URLEncoder;

public class gv {
   private static gf if = gf.if();
   private final String a;
   private final String for;
   private static String do = "https://mcoapi.minecraft.net/";

   public gv(j7 var1) {
      this.a = var1.a;
      this.for = var1.if;
   }

   public gk a() {
      String var1 = this.a(gt.if(do + "worlds"));
      return gk.if(var1);
   }

   public gm do(long var1) {
      String var3 = this.a(gt.if(do + "worlds" + "/$ID".replace("$ID", String.valueOf(var1))));
      return gm.new(var3);
   }

   public gl for(long var1) {
      String var3 = do + "worlds" + "/$ID/join".replace("$ID", "" + var1);
      String var4 = this.a(gt.if(var3));
      return gl.do(var4);
   }

   public void a(String var1, String var2, String var3) {
      String var4 = do + "worlds" + "/$NAME/$LOCATION_ID".replace("$NAME", this.a(var1)).replace("$LOCATION_ID", var3);
      if (var2 != null && !var2.trim().equals("")) {
         var4 = var4 + "?motd=" + this.a(var2);
      }

      this.a(gt.do(var4, ""));
   }

   public Boolean do() {
      String var1 = do + "mco" + "/available";
      String var2 = this.a(gt.if(var1));
      return Boolean.valueOf(var2);
   }

   public int if() {
      String var1 = do + "payments" + "/unused";
      String var2 = this.a(gt.if(var1));
      return Integer.valueOf(var2);
   }

   public void a(long var1, String var3) {
      String var4 = do + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(var1)).replace("$USER_NAME", var3);
      this.a(gt.a(var4));
   }

   public gm if(long var1, String var3) {
      String var4 = do + "worlds" + "/$WORLD_ID/invites/$USER_NAME".replace("$WORLD_ID", String.valueOf(var1)).replace("$USER_NAME", var3);
      String var5 = this.a(gt.do(var4, ""));
      return gm.new(var5);
   }

   public void a(long var1, String var3, String var4) {
      String var5 = do + "worlds" + "/$WORLD_ID/$NAME".replace("$WORLD_ID", String.valueOf(var1)).replace("$NAME", this.a(var3));
      if (var4 != null && !var4.trim().equals("")) {
         var5 = var5 + "?motd=" + this.a(var4);
      }

      this.a(gt.if(var5, ""));
   }

   public Boolean if(long var1) {
      String var3 = do + "worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(var1));
      String var4 = this.a(gt.if(var3, ""));
      return Boolean.valueOf(var4);
   }

   public Boolean int(long var1) {
      String var3 = do + "worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(var1));
      String var4 = this.a(gt.if(var3, ""));
      return Boolean.valueOf(var4);
   }

   public Boolean a(long var1) {
      String var3 = do + "worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1));
      String var4 = this.a(gt.a(var3, "", 30000, 80000));
      return Boolean.valueOf(var4);
   }

   public gn for() {
      String var1 = this.a(gt.if(do + "worlds" + "/locations"));
      return gn.a(var1);
   }

   public gh new(long var1) {
      String var3 = this.a(gt.if(do + "subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1))));
      return gh.a(var3);
   }

   private String a(String var1) {
      return URLEncoder.encode(var1, "UTF-8");
   }

   private String a(gt var1) {
      var1.a("sid", this.a);
      var1.a("user", this.for);
      if (if instanceof gd) {
         gc var2 = (gc)if.a();
         var1.a((String)var2.if(), (String)var2.a());
      }

      try {
         int var5 = var1.new();
         if (var5 == 503) {
            throw new gi(10);
         } else if (var5 >= 200 && var5 < 300) {
            gf var3 = var1.if();
            if (var3 instanceof gd) {
               if = var3;
            }

            return var1.for();
         } else {
            throw new gj(var1.new(), var1.for());
         }
      } catch (gu var4) {
         throw new gj(500, "Server not available!");
      }
   }
}
