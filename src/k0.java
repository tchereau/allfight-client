import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.lwjgl.opengl.GL11;

public class k0 {
   private static final Map if = new HashMap();
   private static final List a = new ArrayList();

   public static synchronized int a(int var0) {
      int var1 = GL11.glGenLists(var0);
      if.put(var1, var0);
      return var1;
   }

   public static synchronized int do() {
      int var0 = GL11.glGenTextures();
      a.add(var0);
      return var0;
   }

   public static synchronized void int(int var0) {
      GL11.glDeleteLists(var0, (Integer)if.remove(var0));
   }

   public static synchronized void if() {
      for(int var0 = 0; var0 < a.size(); ++var0) {
         GL11.glDeleteTextures((Integer)a.get(var0));
      }

      a.clear();
   }

   public static synchronized void a() {
      Iterator var0 = if.entrySet().iterator();

      while(var0.hasNext()) {
         Entry var1 = (Entry)var0.next();
         GL11.glDeleteLists((Integer)var1.getKey(), (Integer)var1.getValue());
      }

      if.clear();
      if();
   }

   public static synchronized ByteBuffer for(int var0) {
      return ByteBuffer.allocateDirect(var0).order(ByteOrder.nativeOrder());
   }

   public static IntBuffer do(int var0) {
      return for(var0 << 2).asIntBuffer();
   }

   public static FloatBuffer if(int var0) {
      return for(var0 << 2).asFloatBuffer();
   }
}
