import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import java.util.Arrays;
import org.lwjgl.opengl.ARBVertexBufferObject;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;

public class c4 {
   private static boolean F = false;
   private static boolean E = false;
   private ByteBuffer C;
   private IntBuffer B;
   private FloatBuffer A;
   private ShortBuffer z;
   private int[] y;
   private int x;
   private double w;
   private double u;
   private int t;
   private int s;
   private boolean q;
   private boolean o;
   private boolean n;
   private boolean m;
   private int l;
   private int k;
   private boolean j;
   public int i;
   public double h;
   public double f;
   public double e;
   private int d;
   public static c4 G = new c4(524288);
   public boolean c;
   private boolean try;
   private IntBuffer new;
   private int int;
   private int for;
   private int do;
   private boolean v;
   private static boolean else;
   public static boolean void;
   public boolean g;
   public int a;
   public boolean p;
   private c4[] byte;
   private int[] D;
   private static int case;
   private long char;
   public static int[][] r;
   private i[] if;
   private boolean[] b;
   private int[] long;
   private int[] goto;

   public c4() {
      this(65536);
      this.g = false;
   }

   public c4(int var1) {
      this.v = false;
      this.g = true;
      this.a = 0;
      this.p = true;
      this.byte = new c4[0];
      this.D = new int[0];
      this.char = 0L;
      this.if = null;
      this.b = new boolean[256];
      this.long = null;
      this.goto = null;
      this.x = 0;
      this.q = false;
      this.o = false;
      this.n = false;
      this.m = false;
      this.l = 0;
      this.k = 0;
      this.j = false;
      this.c = false;
      this.try = false;
      this.int = 0;
      this.for = 10;
      this.do = var1;
      this.C = k0.for(var1 * 4);
      this.B = this.C.asIntBuffer();
      this.A = this.C.asFloatBuffer();
      this.z = this.C.asShortBuffer();
      this.y = new int[var1];
      this.try = E && GLContext.getCapabilities().GL_ARB_vertex_buffer_object;
      if (this.try) {
         this.new = k0.do(this.for);
         ARBVertexBufferObject.glGenBuffersARB(this.new);
      }

      this.if = new i[4];

      for(int var2 = 0; var2 < this.if.length; ++var2) {
         this.if[var2] = new i();
      }

      this.long = new int[this.do];
   }

   private void do(int var1, int var2) {
      int var3 = var2 - var1;
      if (var3 > 0) {
         if (var3 % 4 == 0) {
            if (this.try) {
               throw new IllegalStateException("VBO not implemented");
            } else {
               this.A.position(3);
               GL11.glTexCoordPointer(2, 32, this.A);
               q.if(q.a);
               this.z.position(14);
               GL11.glTexCoordPointer(2, 32, this.z);
               GL11.glEnableClientState(32888);
               q.if(q.if);
               this.C.position(20);
               GL11.glColorPointer(4, true, 32, this.C);
               this.A.position(0);
               GL11.glVertexPointer(3, 32, this.A);
               if (this.i == 7 && F) {
                  GL11.glDrawArrays(4, var1, var3);
               } else {
                  GL11.glDrawArrays(this.i, var1, var3);
               }

            }
         }
      }
   }

   private int a(int var1, int var2) {
      GL11.glBindTexture(3553, this.goto[var1]);
      int var3 = -1;
      int var4 = -1;

      for(int var5 = var2; var5 < this.k; ++var5) {
         int var6 = this.long[var5];
         if (var6 == var1) {
            if (var4 < 0) {
               var4 = var5;
            }
         } else if (var4 >= 0) {
            this.do(var4, var5);
            var4 = -1;
            if (var3 < 0) {
               var3 = var5;
            }
         }
      }

      if (var4 >= 0) {
         this.do(var4, this.k);
      }

      if (var3 < 0) {
         var3 = this.k;
      }

      return var3;
   }

   public int for() {
      if (!this.c) {
         throw new IllegalStateException("Not tesselating!");
      } else {
         int var2;
         int var3;
         if (this.v && this.byte.length > 0) {
            boolean var1 = false;

            for(var2 = 0; var2 < this.byte.length; ++var2) {
               var3 = this.D[var2];
               if (var3 <= 0) {
                  break;
               }

               c4 var4 = this.byte[var2];
               if (var4.c) {
                  GL11.glBindTexture(3553, var3);
                  var1 = true;
                  var4.for();
               }
            }

            if (var1) {
               if (this.a > 0) {
                  GL11.glBindTexture(3553, this.a);
               } else {
                  GL11.glBindTexture(3553, int());
               }
            }
         }

         this.c = false;
         int var5;
         if (this.x > 0) {
            if (qs.new() && this.goto != null) {
               this.B.clear();
               this.B.put(this.y, 0, this.l);
               this.C.position(0);
               this.C.limit(this.l * 4);
               GL11.glEnableClientState(32888);
               GL11.glEnableClientState(32886);
               GL11.glEnableClientState(32884);
               Arrays.fill(this.b, false);
               var5 = 0;

               for(var2 = 0; var2 < this.k; ++var2) {
                  var3 = this.long[var2];
                  if (!this.b[var3]) {
                     var2 = this.a(var3, var2) - 1;
                     ++var5;
                     this.b[var3] = true;
                  }
               }

               GL11.glDisableClientState(32888);
               q.if(q.a);
               GL11.glDisableClientState(32888);
               q.if(q.if);
               GL11.glDisableClientState(32886);
               GL11.glDisableClientState(32884);
            } else {
               this.B.clear();
               this.B.put(this.y, 0, this.l);
               this.C.position(0);
               this.C.limit(this.l * 4);
               if (this.try) {
                  this.int = (this.int + 1) % this.for;
                  ARBVertexBufferObject.glBindBufferARB(34962, this.new.get(this.int));
                  ARBVertexBufferObject.glBufferDataARB(34962, this.C, 35040);
               }

               if (this.o) {
                  if (this.try) {
                     GL11.glTexCoordPointer(2, 5126, 32, 12L);
                  } else {
                     this.A.position(3);
                     GL11.glTexCoordPointer(2, 32, this.A);
                  }

                  GL11.glEnableClientState(32888);
               }

               if (this.n) {
                  q.if(q.a);
                  if (this.try) {
                     GL11.glTexCoordPointer(2, 5122, 32, 28L);
                  } else {
                     this.z.position(14);
                     GL11.glTexCoordPointer(2, 32, this.z);
                  }

                  GL11.glEnableClientState(32888);
                  q.if(q.if);
               }

               if (this.q) {
                  if (this.try) {
                     GL11.glColorPointer(4, 5121, 32, 20L);
                  } else {
                     this.C.position(20);
                     GL11.glColorPointer(4, true, 32, this.C);
                  }

                  GL11.glEnableClientState(32886);
               }

               if (this.m) {
                  if (this.try) {
                     GL11.glNormalPointer(5121, 32, 24L);
                  } else {
                     this.C.position(24);
                     GL11.glNormalPointer(32, this.C);
                  }

                  GL11.glEnableClientState(32885);
               }

               if (this.try) {
                  GL11.glVertexPointer(3, 5126, 32, 0L);
               } else {
                  this.A.position(0);
                  GL11.glVertexPointer(3, 32, this.A);
               }

               GL11.glEnableClientState(32884);
               if (this.i == 7 && F) {
                  GL11.glDrawArrays(4, 0, this.x);
               } else {
                  GL11.glDrawArrays(this.i, 0, this.x);
               }

               GL11.glDisableClientState(32884);
               if (this.o) {
                  GL11.glDisableClientState(32888);
               }

               if (this.n) {
                  q.if(q.a);
                  GL11.glDisableClientState(32888);
                  q.if(q.if);
               }

               if (this.q) {
                  GL11.glDisableClientState(32886);
               }

               if (this.m) {
                  GL11.glDisableClientState(32885);
               }
            }
         }

         var5 = this.l * 4;
         this.a();
         return var5;
      }
   }

   private void a() {
      this.x = 0;
      this.C.clear();
      this.l = 0;
      this.k = 0;
   }

   public void if() {
      this.do(7);
   }

   public void do(int var1) {
      if (this.c) {
         throw new IllegalStateException("Already tesselating!");
      } else {
         this.c = true;
         this.a();
         this.i = var1;
         this.m = false;
         this.q = false;
         this.o = false;
         this.n = false;
         this.j = false;
         if (this.v && this.a == 0) {
            this.goto = for(int());
         } else {
            this.goto = for(this.a);
         }

      }
   }

   public void a(double var1, double var3) {
      this.o = true;
      this.w = var1;
      this.u = var3;
   }

   public void if(int var1) {
      this.n = true;
      this.t = var1;
   }

   public void a(float var1, float var2, float var3) {
      this.a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F));
   }

   public void a(float var1, float var2, float var3, float var4) {
      this.a((int)(var1 * 255.0F), (int)(var2 * 255.0F), (int)(var3 * 255.0F), (int)(var4 * 255.0F));
   }

   public void a(int var1, int var2, int var3) {
      this.a(var1, var2, var3, 255);
   }

   public void a(int var1, int var2, int var3, int var4) {
      if (!this.j) {
         if (var1 > 255) {
            var1 = 255;
         }

         if (var2 > 255) {
            var2 = 255;
         }

         if (var3 > 255) {
            var3 = 255;
         }

         if (var4 > 255) {
            var4 = 255;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         if (var4 < 0) {
            var4 = 0;
         }

         this.q = true;
         if (else) {
            this.s = var4 << 24 | var3 << 16 | var2 << 8 | var1;
         } else {
            this.s = var1 << 24 | var2 << 16 | var3 << 8 | var4;
         }

      }
   }

   public void a(double var1, double var3, double var5, double var7, double var9) {
      if (qs.new() && this.goto != null) {
         int var11 = this.k % 4;
         i var12 = this.if[var11];
         var12.a = var1;
         var12.try = var3;
         var12.new = var5;
         var12.for = var7;
         var12.do = var9;
         var12.if = this.s;
         var12.int = this.t;
         if (var11 != 3) {
            ++this.k;
         } else {
            this.k -= 3;
            double var13 = (this.if[0].for + this.if[1].for + this.if[2].for + this.if[3].for) / 4.0D;
            double var15 = (this.if[0].do + this.if[1].do + this.if[2].do + this.if[3].do) / 4.0D;
            if (var13 > 0.875D && var13 < 1.0D && var15 > 0.75D && var15 < 0.875D) {
               boolean var17 = true;
            }

            int var29 = (int)(var13 * 16.0D);
            int var18 = (int)(var15 * 16.0D);
            int var19 = var18 * 16 + var29;
            double var20 = (double)var29 / 16.0D;
            double var22 = (double)var18 / 16.0D;
            int var24 = this.k;

            for(int var25 = 0; var25 < 4; ++var25) {
               i var26 = this.if[var25];
               var1 = var26.a;
               var3 = var26.try;
               var5 = var26.new;
               var7 = var26.for;
               var9 = var26.do;
               this.long[var24 + var25] = var19;
               var7 -= var20;
               var9 -= var22;
               var7 *= 16.0D;
               var9 *= 16.0D;
               int var27 = this.s;
               this.s = var26.if;
               int var28 = this.t;
               this.t = var26.int;
               this.a(var7, var9);
               this.if(var1, var3, var5);
               this.s = var27;
               this.t = var28;
            }

         }
      } else {
         this.a(var7, var9);
         this.if(var1, var3, var5);
      }
   }

   public void if(double var1, double var3, double var5) {
      if (this.p && this.l >= this.do - 32) {
         qs.for("Expand tessellator buffer, old: " + this.do + ", new: " + this.do * 2);
         this.do *= 2;
         int[] var7 = new int[this.do];
         System.arraycopy(this.y, 0, var7, 0, this.y.length);
         this.y = var7;
         this.C = k0.for(this.do * 4);
         this.B = this.C.asIntBuffer();
         this.A = this.C.asFloatBuffer();
         this.z = this.C.asShortBuffer();
         int[] var8 = new int[this.do];
         System.arraycopy(this.long, 0, var8, 0, this.long.length);
         this.long = var8;
      }

      ++this.k;
      if (this.i == 7 && F && this.k % 4 == 0) {
         for(int var9 = 0; var9 < 2; ++var9) {
            int var10 = 8 * (3 - var9);
            if (this.o) {
               this.y[this.l + 3] = this.y[this.l - var10 + 3];
               this.y[this.l + 4] = this.y[this.l - var10 + 4];
            }

            if (this.n) {
               this.y[this.l + 7] = this.y[this.l - var10 + 7];
            }

            if (this.q) {
               this.y[this.l + 5] = this.y[this.l - var10 + 5];
            }

            this.y[this.l + 0] = this.y[this.l - var10 + 0];
            this.y[this.l + 1] = this.y[this.l - var10 + 1];
            this.y[this.l + 2] = this.y[this.l - var10 + 2];
            ++this.x;
            this.l += 8;
         }
      }

      if (this.o) {
         this.y[this.l + 3] = Float.floatToRawIntBits((float)this.w);
         this.y[this.l + 4] = Float.floatToRawIntBits((float)this.u);
      }

      if (this.n) {
         this.y[this.l + 7] = this.t;
      }

      if (this.q) {
         this.y[this.l + 5] = this.s;
      }

      if (this.m) {
         this.y[this.l + 6] = this.d;
      }

      this.y[this.l + 0] = Float.floatToRawIntBits((float)(var1 + this.h));
      this.y[this.l + 1] = Float.floatToRawIntBits((float)(var3 + this.f));
      this.y[this.l + 2] = Float.floatToRawIntBits((float)(var5 + this.e));
      this.l += 8;
      ++this.x;
      if (!this.p && this.k % 4 == 0 && this.l >= this.do - 32) {
         this.for();
         this.c = true;
      }

   }

   public void a(int var1) {
      int var2 = var1 >> 16 & 255;
      int var3 = var1 >> 8 & 255;
      int var4 = var1 & 255;
      this.a(var2, var3, var4);
   }

   public void if(int var1, int var2) {
      int var3 = var1 >> 16 & 255;
      int var4 = var1 >> 8 & 255;
      int var5 = var1 & 255;
      this.a(var3, var4, var5, var2);
   }

   public void new() {
      this.j = true;
   }

   public void do(float var1, float var2, float var3) {
      this.m = true;
      byte var4 = (byte)((int)(var1 * 127.0F));
      byte var5 = (byte)((int)(var2 * 127.0F));
      byte var6 = (byte)((int)(var3 * 127.0F));
      this.d = var4 & 255 | (var5 & 255) << 8 | (var6 & 255) << 16;
   }

   public void a(double var1, double var3, double var5) {
      this.h = var1;
      this.f = var3;
      this.e = var5;
   }

   public void if(float var1, float var2, float var3) {
      this.h += (double)var1;
      this.f += (double)var2;
      this.e += (double)var3;
   }

   public boolean do() {
      return this.v;
   }

   public void a(boolean var1) {
      if (this.v != var1) {
         for(int var2 = 0; var2 < this.D.length; ++var2) {
            this.D[var2] = 0;
         }
      }

      this.v = var1;
   }

   public c4 if(ajd var1) {
      return G;
   }

   public c4 a(ajd var1) {
      return null;
   }

   public static int int() {
      if (case == 0) {
         case = qs.q().new("/terrain.png");
      }

      return case;
   }

   public static void a(int var0, int[] var1) {
      if (var0 >= r.length) {
         int[][] var2 = new int[var0 + 1][];
         System.arraycopy(r, 0, var2, 0, r.length);
         r = var2;
      }

      r[var0] = var1;
   }

   public static int[] for(int var0) {
      return var0 > 0 && var0 < r.length ? r[var0] : null;
   }

   static {
      else = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
      void = false;
      case = 0;
      r = new int[0][];
   }
}
