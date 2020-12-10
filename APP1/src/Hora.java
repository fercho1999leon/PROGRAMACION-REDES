
// Fig. 26.6: Hora.java
// Archivo de bean de p�gina que establece textoReloj a la hora en el servidor Web.
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.rave.web.ui.component.Body;
import com.sun.rave.web.ui.component.Form;
import com.sun.rave.web.ui.component.Head;
import com.sun.rave.web.ui.component.Html;
import com.sun.rave.web.ui.component.Link;
import com.sun.rave.web.ui.component.Page;
import javax.faces.FacesException;
import com.sun.rave.web.ui.component.StaticText;
import java.text.DateFormat;
import java.util.Date;

public class Hora extends AbstractPageBean {
	private int __placeholder;

// m�todo de inicializaci�n de componentes, generado autom�ticamente.
	private void _init() throws Exception {
// cuerpo vac�o
	} // fin del m�todo _init

	private Page page1 = new Page();

	public Page getPage1() {
		return page1;
	} // fin del m�todo getPage1

	public void setPage1(Page p) {
		this.page1 = p;
	} // fin del m�todo setPage1

	private Html html1 = new Html();

	public Html getHtml1() {
		return html1;
	} // fin del m�todo getHtml1

	public void setHtml1(Html h) {
		this.html1 = h;
	} // fin del m�todo setHtml1

	private Head head1 = new Head();

	public Head getHead1() {
		return head1;
	} // fin del m�todo getHead1

	public void setHead1(Head h) {
		this.head1 = h;
	} // fin del m�todo setHead1

	private Link link1 = new Link();

	public Link getLink1() {
		return link1;
	} // fin del m�todo getLink1

	public void setLink1(Link l) {
		this.link1 = l;
	} // fin del m�todo setLink1

	private Body body1 = new Body();

	public Body getBody1() {
		return body1;
	} // fin del m�todo getBody1

	public void setBody1(Body b) {
		this.body1 = b;
	} // fin del m�todo setBody1

	private Form form1 = new Form();

	public Form getForm1() {
		return form1;
	} // fin del m�todo getForm1

	public void setForm1(Form f) {
		this.form1 = f;
	} // fin del m�todo setForm1

	private StaticText encabezadoHora = new StaticText();

	public StaticText getEncabezadoHora() {
		return encabezadoHora;
	} // fin del m�todo getEncabezadoHora

	public void setEncabezadoHora(StaticText st) {
		this.encabezadoHora = st;
	} // fin del m�todo setEncabezadoHora

	private StaticText textoReloj = new StaticText();

	public StaticText getTextoReloj() {
		return textoReloj;
	} // fin del m�todo getTextoReloj

	public void setTextoReloj(StaticText st) {
		this.textoReloj = st;
	} // fin del m�todo setTextoReloj
// Construye una nueva instancia de bean de p�gina

	public Hora() {
// constructor vac�o
	} // fin del constructor
// Devuelve una referencia al bean de datos con �mbito

	protected RequestBean1 getRequestBean1() {
		return (RequestBean1) getBean("RequestBean1");
	} // fin del m�todo getRequestBean1
// Devuelve una referencia al bean de datos con �mbito

	protected ApplicationBean1 getApplicationBean1() {
		return (ApplicationBean1) getBean("ApplicationBean1");
	} // fin del m�todo getApplicationBean1
// Devuelve una referencia al bean de datos con �mbito

	protected SessionBean1 getSessionBean1() {
		return (SessionBean1) getBean("SessionBean1");
	} // fin del m�todo getSessionBean1
// inicializa el contenido de la p�gina

	public void init() {
		super.init();
		try {
			_init();
		} // fin de try
		catch (Exception e) {
			log("Error al inicializar Hora", e);
			throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
		} // fin de catch
	} // fin del m�todo init
// m�todo que se llama cuando ocurre una petici�n de devoluci�n de env�o

	public void preprocess() {
// cuerpo vac�o
	} // fin del m�todo preprocess
// m�todo al que se llama antes de desplegar la p�gina

	public void prerender() {
		textoReloj.setValue(DateFormat.getTimeInstance(DateFormat.LONG).format(new Date()));
	} // fin del m�todo prerender
// m�todo al que se llama una vez que se completa el despliegue, si se llam� a init

	public void destroy() {
// cuerpo vac�o
	} // fin del m�todo destroy
} // fin de la clase Hora
