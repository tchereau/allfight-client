import a.a.b.CodecJOrbis;
import java.io.InputStream;

public class ae extends CodecJOrbis {
   protected InputStream openInputStream() {
      return new ad(this, this.url, this.urlConnection.getInputStream());
   }
}
