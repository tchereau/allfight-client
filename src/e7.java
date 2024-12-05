import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class e7 {
   public float i;
   public float h;
   private int int;
   private int for;
   public float g;
   public float f;
   public float e;
   public float d;
   public float c;
   public float b;
   private boolean do;
   private int if;
   public boolean void;
   public boolean long;
   public boolean goto;
   public List else;
   public List char;
   public final String case;
   private fx a;
   public float byte;
   public float try;
   public float new;

   public e7(fx var1, String var2) {
      this.i = 64.0F;
      this.h = 32.0F;
      this.do = false;
      this.if = 0;
      this.void = false;
      this.long = true;
      this.goto = false;
      this.else = new ArrayList();
      this.a = var1;
      var1.int.add(this);
      this.case = var2;
      this.if(var1.do, var1.if);
   }

   public e7(fx var1) {
      this(var1, (String)null);
   }

   public e7(fx var1, int var2, int var3) {
      this(var1);
      this.a(var2, var3);
   }

   public void a(e7 var1) {
      if (this.char == null) {
         this.char = new ArrayList();
      }

      this.char.add(var1);
   }

   public e7 a(int var1, int var2) {
      this.int = var1;
      this.for = var2;
      return this;
   }

   public e7 a(String var1, float var2, float var3, float var4, int var5, int var6, int var7) {
      var1 = this.case + "." + var1;
      e6 var8 = this.a.a(var1);
      this.a(var8.if, var8.a);
      this.else.add((new e8(this, this.int, this.for, var2, var3, var4, var5, var6, var7, 0.0F)).a(var1));
      return this;
   }

   public e7 a(float var1, float var2, float var3, int var4, int var5, int var6) {
      this.else.add(new e8(this, this.int, this.for, var1, var2, var3, var4, var5, var6, 0.0F));
      return this;
   }

   public void a(float var1, float var2, float var3, int var4, int var5, int var6, float var7) {
      this.else.add(new e8(this, this.int, this.for, var1, var2, var3, var4, var5, var6, var7));
   }

   public void a(float var1, float var2, float var3) {
      this.g = var1;
      this.f = var2;
      this.e = var3;
   }

   public void for(float var1) {
      if (!this.goto) {
         if (this.long) {
            if (!this.do) {
               this.a(var1);
            }

            GL11.glTranslatef(this.byte, this.try, this.new);
            int var2;
            if (this.d == 0.0F && this.c == 0.0F && this.b == 0.0F) {
               if (this.g == 0.0F && this.f == 0.0F && this.e == 0.0F) {
                  GL11.glCallList(this.if);
                  if (this.char != null) {
                     for(var2 = 0; var2 < this.char.size(); ++var2) {
                        ((e7)this.char.get(var2)).for(var1);
                     }
                  }
               } else {
                  GL11.glTranslatef(this.g * var1, this.f * var1, this.e * var1);
                  GL11.glCallList(this.if);
                  if (this.char != null) {
                     for(var2 = 0; var2 < this.char.size(); ++var2) {
                        ((e7)this.char.get(var2)).for(var1);
                     }
                  }

                  GL11.glTranslatef(-this.g * var1, -this.f * var1, -this.e * var1);
               }
            } else {
               GL11.glPushMatrix();
               GL11.glTranslatef(this.g * var1, this.f * var1, this.e * var1);
               if (this.b != 0.0F) {
                  GL11.glRotatef(this.b * 57.295776F, 0.0F, 0.0F, 1.0F);
               }

               if (this.c != 0.0F) {
                  GL11.glRotatef(this.c * 57.295776F, 0.0F, 1.0F, 0.0F);
               }

               if (this.d != 0.0F) {
                  GL11.glRotatef(this.d * 57.295776F, 1.0F, 0.0F, 0.0F);
               }

               GL11.glCallList(this.if);
               if (this.char != null) {
                  for(var2 = 0; var2 < this.char.size(); ++var2) {
                     ((e7)this.char.get(var2)).for(var1);
                  }
               }

               GL11.glPopMatrix();
            }

            GL11.glTranslatef(-this.byte, -this.try, -this.new);
         }
      }
   }

   public void do(float var1) {
      if (!this.goto) {
         if (this.long) {
            if (!this.do) {
               this.a(var1);
            }

            GL11.glPushMatrix();
            GL11.glTranslatef(this.g * var1, this.f * var1, this.e * var1);
            if (this.c != 0.0F) {
               GL11.glRotatef(this.c * 57.295776F, 0.0F, 1.0F, 0.0F);
            }

            if (this.d != 0.0F) {
               GL11.glRotatef(this.d * 57.295776F, 1.0F, 0.0F, 0.0F);
            }

            if (this.b != 0.0F) {
               GL11.glRotatef(this.b * 57.295776F, 0.0F, 0.0F, 1.0F);
            }

            GL11.glCallList(this.if);
            GL11.glPopMatrix();
         }
      }
   }

   public void if(float var1) {
      if (!this.goto) {
         if (this.long) {
            if (!this.do) {
               this.a(var1);
            }

            if (this.d == 0.0F && this.c == 0.0F && this.b == 0.0F) {
               if (this.g != 0.0F || this.f != 0.0F || this.e != 0.0F) {
                  GL11.glTranslatef(this.g * var1, this.f * var1, this.e * var1);
               }
            } else {
               GL11.glTranslatef(this.g * var1, this.f * var1, this.e * var1);
               if (this.b != 0.0F) {
                  GL11.glRotatef(this.b * 57.295776F, 0.0F, 0.0F, 1.0F);
               }

               if (this.c != 0.0F) {
                  GL11.glRotatef(this.c * 57.295776F, 0.0F, 1.0F, 0.0F);
               }

               if (this.d != 0.0F) {
                  GL11.glRotatef(this.d * 57.295776F, 1.0F, 0.0F, 0.0F);
               }
            }

         }
      }
   }

   private void a(float var1) {
      this.if = k0.a(1);
      GL11.glNewList(this.if, 4864);
      c4 var2 = c4.G;

      for(int var3 = 0; var3 < this.else.size(); ++var3) {
         ((e8)this.else.get(var3)).a(var2, var1);
      }

      GL11.glEndList();
      this.do = true;
   }

   public e7 if(int var1, int var2) {
      this.i = (float)var1;
      this.h = (float)var2;
      return this;
   }
}
