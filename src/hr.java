import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class hr extends i5 {
   private i5 kb;
   private ju ka;
   private ju j9;
   private String j8;
   private String j7;
   private static int j6 = 0;
   private static int j5 = 1;
   private static int j4 = 2;
   private volatile List j3;
   private volatile go ke = null;
   private boolean kd = false;
   private String kc = "You must enter a name!";

   public hr(i5 var1) {
      super.hT = Collections.synchronizedList(new ArrayList());
      this.kb = var1;
   }

   public void dG() {
      this.j9.de();
      this.ka.de();
      this.j8 = this.j9.dc();
      this.j7 = this.ka.dc();
   }

   public void dA() {
      aqy var1 = aqy.if();
      Keyboard.enableRepeatEvents(true);
      this.hT.clear();
      this.hT.add(new j6(j6, this.hV / 2 - 100, this.hU / 4 + 120 + 17, 97, 20, var1.a("mco.create.world")));
      this.hT.add(new j6(j5, this.hV / 2 + 5, this.hU / 4 + 120 + 17, 95, 20, var1.a("gui.cancel")));
      this.j9 = new ju(this.hR, this.hV / 2 - 100, 55, 200, 20);
      this.j9.h(true);
      if (this.j8 != null) {
         this.j9.case(this.j8);
      }

      this.ka = new ju(this.hR, this.hV / 2 - 100, 95, 200, 20);
      this.ka.M(128);
      if (this.j7 != null) {
         this.ka.case(this.j7);
      }

      this.dR();
   }

   private void dR() {
      if (this.ke == null) {
         (new hq(this)).start();
      } else {
         this.hT.add(new j6(j4, this.hV / 2 - 100, 135, this.ke.h));
      }

   }

   public void dF() {
      Keyboard.enableRepeatEvents(false);
   }

   protected void a(j6 var1) {
      if (var1.hu) {
         if (var1.hv == j5) {
            this.hW.a(this.kb);
         } else if (var1.hv == j6) {
            this.dT();
         } else if (var1.hv == j4) {
            hl var2 = new hl(this, this.j3, this.ke, this.j9.dc(), this.ka.dc());
            this.hW.a((i5)var2);
         }

      }
   }

   private void dT() {
      if (this.dU()) {
         String var1 = this.ka.dc() != null && !this.ka.dc().trim().equals("") ? this.ka.dc() : "Minecraft Realms Server";
         hp var2 = new hp(this, this.j9.dc(), var1, this.ke == null ? "NO_LOCATION" : this.ke.i);
         hi var3 = new hi(this.hW, this.kb, var2);
         var3.dO();
         this.hW.a((i5)var3);
      }

   }

   private boolean dU() {
      this.kd = this.j9.dc() == null || this.j9.dc().trim().equals("");
      return !this.kd;
   }

   protected void if(char var1, int var2) {
      this.j9.a(var1, var2);
      this.ka.a(var1, var2);
      if (var1 == '\t') {
         if (this.j9.c9()) {
            this.j9.h(false);
            this.ka.h(true);
         } else {
            this.j9.h(true);
            this.ka.h(false);
         }
      }

      if (var1 == '\r') {
         this.a((j6)this.hT.get(0));
      }

   }

   protected void char(int var1, int var2, int var3) {
      super.char(var1, var2, var3);
      this.ka.case(var1, var2, var3);
      this.j9.case(var1, var2, var3);
   }

   public void if(int var1, int var2, float var3) {
      aqy var4 = aqy.if();
      this.dx();
      this.a(this.hR, var4.a("mco.selectServer.create"), this.hV / 2, 11, 16777215);
      this.if(this.hR, var4.a("mco.configure.world.name"), this.hV / 2 - 100, 42, 10526880);
      this.if(this.hR, var4.a("mco.configure.world.description"), this.hV / 2 - 100, 83, 10526880);
      if (this.ke != null) {
         this.if(this.hR, var4.a("mco.configure.world.location"), this.hV / 2 - 100, 124, 10526880);
      }

      if (this.kd) {
         this.a(this.hR, this.kc, this.hV / 2, 167, 16711680);
      }

      this.j9.db();
      this.ka.db();
      super.if(var1, var2, var3);
   }

   public void a(go var1, String var2, String var3) {
      this.ke = var1;
      this.j9.case(var2);
      this.ka.case(var3);
   }

   // $FF: synthetic method
   static Minecraft if(hr var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static List a(hr var0, List var1) {
      return var0.j3 = var1;
   }

   // $FF: synthetic method
   static go a(hr var0, go var1) {
      return var0.ke = var1;
   }

   // $FF: synthetic method
   static int dS() {
      return j4;
   }

   // $FF: synthetic method
   static go a(hr var0) {
      return var0.ke;
   }

   // $FF: synthetic method
   static List int(hr var0) {
      return var0.hT;
   }

   // $FF: synthetic method
   static Minecraft new(hr var0) {
      return var0.hW;
   }

   // $FF: synthetic method
   static i5 do(hr var0) {
      return var0.kb;
   }

   // $FF: synthetic method
   static Minecraft for(hr var0) {
      return var0.hW;
   }
}
