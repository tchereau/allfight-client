import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class sc {
   private si if;
   private Map a = new HashMap();
   private List for = new ArrayList();
   private Map do = new HashMap();

   public sc(si var1) {
      this.if = var1;
      this.a();
   }

   public s0 a(Class var1, String var2) {
      s0 var3 = (s0)this.a.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         if (this.if != null) {
            try {
               File var4 = this.if.a(var2);
               if (var4 != null && var4.exists()) {
                  try {
                     var3 = (s0)var1.getConstructor(String.class).newInstance(var2);
                  } catch (Exception var7) {
                     throw new RuntimeException("Failed to instantiate " + var1.toString(), var7);
                  }

                  FileInputStream var5 = new FileInputStream(var4);
                  aqv var6 = aqk.a((InputStream)var5);
                  var5.close();
                  var3.if(var6.char("data"));
               }
            } catch (Exception var8) {
               var8.printStackTrace();
            }
         }

         if (var3 != null) {
            this.a.put(var2, var3);
            this.for.add(var3);
         }

         return var3;
      }
   }

   public void a(String var1, s0 var2) {
      if (var2 == null) {
         throw new RuntimeException("Can't set null data");
      } else {
         if (this.a.containsKey(var1)) {
            this.for.remove(this.a.remove(var1));
         }

         this.a.put(var1, var2);
         this.for.add(var2);
      }
   }

   public void if() {
      for(int var1 = 0; var1 < this.for.size(); ++var1) {
         s0 var2 = (s0)this.for.get(var1);
         if (var2.if()) {
            this.a(var2);
            var2.a(false);
         }
      }

   }

   private void a(s0 var1) {
      if (this.if != null) {
         try {
            File var2 = this.if.a(var1.if);
            if (var2 != null) {
               aqv var3 = new aqv();
               var1.a(var3);
               aqv var4 = new aqv();
               var4.a("data", var3);
               FileOutputStream var5 = new FileOutputStream(var2);
               aqk.a(var4, (OutputStream)var5);
               var5.close();
            }
         } catch (Exception var6) {
            var6.printStackTrace();
         }

      }
   }

   private void a() {
      try {
         this.do.clear();
         if (this.if == null) {
            return;
         }

         File var1 = this.if.a("idcounts");
         if (var1 != null && var1.exists()) {
            DataInputStream var2 = new DataInputStream(new FileInputStream(var1));
            aqv var3 = aqk.a((DataInput)var2);
            var2.close();
            Iterator var4 = var3.new().iterator();

            while(var4.hasNext()) {
               aqd var5 = (aqd)var4.next();
               if (var5 instanceof aqi) {
                  aqi var6 = (aqi)var5;
                  String var7 = var6.if();
                  short var8 = var6.for;
                  this.do.put(var7, var8);
               }
            }
         }
      } catch (Exception var9) {
         var9.printStackTrace();
      }

   }

   public int a(String var1) {
      Short var2 = (Short)this.do.get(var1);
      if (var2 == null) {
         var2 = Short.valueOf((short)0);
      } else {
         var2 = (short)(var2 + 1);
      }

      this.do.put(var1, var2);
      if (this.if == null) {
         return var2;
      } else {
         try {
            File var3 = this.if.a("idcounts");
            if (var3 != null) {
               aqv var4 = new aqv();
               Iterator var5 = this.do.keySet().iterator();

               while(var5.hasNext()) {
                  String var6 = (String)var5.next();
                  short var7 = (Short)this.do.get(var6);
                  var4.a(var6, var7);
               }

               DataOutputStream var9 = new DataOutputStream(new FileOutputStream(var3));
               aqk.a(var4, (DataOutput)var9);
               var9.close();
            }
         } catch (Exception var8) {
            var8.printStackTrace();
         }

         return var2;
      }
   }
}
