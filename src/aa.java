import a.a.SoundSystem;
import a.a.SoundSystemConfig;
import a.a.a.LibraryLWJGLOpenAL;
import a.a.b.CodecJOrbis;
import a.a.b.CodecWav;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class aa {
   private static SoundSystem else;
   private y char = new y();
   private y case = new y();
   private y byte = new y();
   private int try = 0;
   private ke new;
   private Set int = new HashSet();
   private List for = new ArrayList();
   private static boolean do = false;
   private Random if = new Random();
   private int a;

   public aa() {
      this.a = this.if.nextInt(12000);
   }

   public void a(ke var1) {
      this.case.a = false;
      this.new = var1;
      if (!do && (var1 == null || var1.ap != 0.0F || var1.ar != 0.0F)) {
         this.new();
      }

   }

   private void new() {
      try {
         float var1 = this.new.ap;
         float var2 = this.new.ar;
         this.new.ap = 0.0F;
         this.new.ar = 0.0F;
         this.new.new();
         SoundSystemConfig.addLibrary(LibraryLWJGLOpenAL.class);
         SoundSystemConfig.setCodec("ogg", CodecJOrbis.class);
         SoundSystemConfig.setCodec("mus", ae.class);
         SoundSystemConfig.setCodec("wav", CodecWav.class);
         else = new SoundSystem();
         this.new.ap = var1;
         this.new.ar = var2;
         this.new.new();
      } catch (Throwable var3) {
         var3.printStackTrace();
         System.err.println("error linking with the LibraryJavaSound plug-in");
      }

      do = true;
   }

   public void int() {
      if (!do && (this.new.ap != 0.0F || this.new.ar != 0.0F)) {
         this.new();
      }

      if (do) {
         if (this.new.ar == 0.0F) {
            else.stop("BgMusic");
         } else {
            else.setVolume("BgMusic", this.new.ar);
         }
      }

   }

   public void try() {
      if (do) {
         else.cleanup();
      }

   }

   public void if(String var1, File var2) {
      this.char.a(var1, var2);
   }

   public void do(String var1, File var2) {
      this.case.a(var1, var2);
   }

   public void a(String var1, File var2) {
      this.byte.a(var1, var2);
   }

   public void byte() {
      if (do && this.new.ar != 0.0F && !else.playing("BgMusic") && !else.playing("streaming")) {
         if (this.a > 0) {
            --this.a;
            return;
         }

         ab var1 = this.byte.a();
         if (var1 != null) {
            this.a = this.if.nextInt(12000) + 12000;
            else.backgroundMusic("BgMusic", var1.a, var1.if, false);
            else.setVolume("BgMusic", this.new.ar);
            else.play("BgMusic");
         }
      }

   }

   public void a(aig var1, float var2) {
      if (do && this.new.ap != 0.0F && var1 != null) {
         float var3 = var1.a0 + (var1.a4 - var1.a0) * var2;
         float var4 = var1.a2 + (var1.a5 - var1.a2) * var2;
         double var5 = var1.ao + (var1.al - var1.ao) * (double)var2;
         double var7 = var1.an + (var1.ak - var1.an) * (double)var2;
         double var9 = var1.am + (var1.aj - var1.am) * (double)var2;
         float var11 = ajs.for(-var4 * 0.017453292F - 3.1415927F);
         float var12 = ajs.try(-var4 * 0.017453292F - 3.1415927F);
         float var13 = -var12;
         float var14 = -ajs.try(-var3 * 0.017453292F - 3.1415927F);
         float var15 = -var11;
         float var16 = 0.0F;
         float var17 = 1.0F;
         float var18 = 0.0F;
         else.setListenerPosition((float)var5, (float)var7, (float)var9);
         else.setListenerOrientation(var13, var14, var15, var16, var17, var18);
      }

   }

   public void a() {
      Iterator var1 = this.int.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         else.stop(var2);
      }

      this.int.clear();
   }

   public void if(String var1, float var2, float var3, float var4) {
      if (do && (this.new.ap != 0.0F || var1 == null)) {
         String var5 = "streaming";
         if (else.playing(var5)) {
            else.stop(var5);
         }

         if (var1 != null) {
            ab var6 = this.case.a(var1);
            if (var6 != null) {
               if (else.playing("BgMusic")) {
                  else.stop("BgMusic");
               }

               float var7 = 16.0F;
               else.newStreamingSource(true, var5, var6.a, var6.if, false, var2, var3, var4, 2, var7 * 4.0F);
               else.setVolume(var5, 0.5F * this.new.ap);
               else.play(var5);
            }
         }
      }

   }

   public void a(String var1, float var2, float var3, float var4) {
      if (do && (this.new.ap != 0.0F || var1 == null)) {
         String var5 = "streaming";
         if (else.playing(var5)) {
            else.stop(var5);
         }

         if (var1 != null) {
            ab var6 = this.case.a(var1);
            if (var6 != null) {
               if (else.playing("BgMusic")) {
                  else.stop("BgMusic");
               }

               float var7 = 16.0F;
               else.newStreamingSource(true, var5, var6.a, var6.if, false, var2, var3, var4, 0, var7 * 4.0F);
               else.setVolume(var5, 0.5F * this.new.ap);
               else.play(var5);
            }
         }
      }

   }

   public void do(aiw var1) {
      this.a(var1, var1);
   }

   public void a(aiw var1, aiw var2) {
      String var3 = "entity_" + var1.av;
      if (this.int.contains(var3)) {
         if (else.playing(var3)) {
            else.setPosition(var3, (float)var2.al, (float)var2.ak, (float)var2.aj);
            else.setVelocity(var3, (float)var2.ai, (float)var2.ah, (float)var2.ag);
         } else {
            this.int.remove(var3);
         }
      }

   }

   public boolean a(aiw var1) {
      if (var1 != null && do) {
         String var2 = "entity_" + var1.av;
         return else.playing(var2);
      } else {
         return false;
      }
   }

   public void if(aiw var1) {
      if (var1 != null && do) {
         String var2 = "entity_" + var1.av;
         if (this.int.contains(var2)) {
            if (else.playing(var2)) {
               else.stop(var2);
            }

            this.int.remove(var2);
         }
      }

   }

   public void a(aiw var1, float var2) {
      if (var1 != null && do && do && this.new.ap != 0.0F) {
         String var3 = "entity_" + var1.av;
         if (else.playing(var3)) {
            else.setVolume(var3, var2 * this.new.ap);
         }
      }

   }

   public void if(aiw var1, float var2) {
      if (var1 != null && do && do && this.new.ap != 0.0F) {
         String var3 = "entity_" + var1.av;
         if (else.playing(var3)) {
            else.setPitch(var3, var2);
         }
      }

   }

   public void a(String var1, aiw var2, float var3, float var4, boolean var5) {
      if (var2 != null && do && (this.new.ap != 0.0F || var1 == null)) {
         String var6 = "entity_" + var2.av;
         if (this.int.contains(var6)) {
            this.do(var2);
         } else {
            if (else.playing(var6)) {
               else.stop(var6);
            }

            if (var1 == null) {
               return;
            }

            ab var7 = this.char.a(var1);
            if (var7 != null && var3 > 0.0F) {
               float var8 = 16.0F;
               if (var3 > 1.0F) {
                  var8 *= var3;
               }

               else.newSource(var5, var6, var7.a, var7.if, false, (float)var2.al, (float)var2.ak, (float)var2.aj, 2, var8);
               else.setLooping(var6, true);
               else.setPitch(var6, var4);
               if (var3 > 1.0F) {
                  var3 = 1.0F;
               }

               else.setVolume(var6, var3 * this.new.ap);
               else.setVelocity(var6, (float)var2.ai, (float)var2.ah, (float)var2.ag);
               else.play(var6);
               this.int.add(var6);
            }
         }
      }

   }

   public void a(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (do && this.new.ap != 0.0F) {
         ab var7 = this.char.a(var1);
         if (var7 != null && var5 > 0.0F) {
            this.try = (this.try + 1) % 256;
            String var8 = "sound_" + this.try;
            float var9 = 16.0F;
            if (var5 > 1.0F) {
               var9 *= var5;
            }

            else.newSource(var5 > 1.0F, var8, var7.a, var7.if, false, var2, var3, var4, 2, var9);
            else.setPitch(var8, var6);
            if (var5 > 1.0F) {
               var5 = 1.0F;
            }

            else.setVolume(var8, var5 * this.new.ap);
            else.play(var8);
         }
      }

   }

   public void a(String var1, float var2, float var3) {
      if (do && this.new.ap != 0.0F) {
         ab var4 = this.char.a(var1);
         if (var4 != null) {
            this.try = (this.try + 1) % 256;
            String var5 = "sound_" + this.try;
            else.newSource(false, var5, var4.a, var4.if, false, 0.0F, 0.0F, 0.0F, 0, 0.0F);
            if (var2 > 1.0F) {
               var2 = 1.0F;
            }

            var2 *= 0.25F;
            else.setPitch(var5, var3);
            else.setVolume(var5, var2 * this.new.ap);
            else.play(var5);
         }
      }

   }

   public void if() {
      Iterator var1 = this.int.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         else.pause(var2);
      }

   }

   public void do() {
      Iterator var1 = this.int.iterator();

      while(var1.hasNext()) {
         String var2 = (String)var1.next();
         else.play(var2);
      }

   }

   public void for() {
      if (!this.for.isEmpty()) {
         Iterator var1 = this.for.iterator();

         while(var1.hasNext()) {
            z var2 = (z)var1.next();
            --var2.do;
            if (var2.do <= 0) {
               this.a(var2.if, var2.a, var2.try, var2.new, var2.int, var2.for);
               var1.remove();
            }
         }
      }

   }

   public void a(String var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      this.for.add(new z(var1, var2, var3, var4, var5, var6, var7));
   }
}
