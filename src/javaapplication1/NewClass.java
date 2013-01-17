import java.awt.*;
import java.awt.event.*;

public class NewClass extends Frame
{
  TextField eingabe;
  Label     ausgabe;

  public static void main( String[] args )
  {
    NewClass meinFenster = new NewClass( "Text-Ein-/Ausgabe" );
    meinFenster.setSize( 400, 200 );
    meinFenster.setVisible( true );
  }

  public NewClass( String fensterTitel )
  {
    super( fensterTitel );
    Label hinweis = new Label( "Text eingeben und mit Return abschliessen" );
    eingabe = new TextField();
    ausgabe = new Label();
    add( BorderLayout.NORTH,  eingabe );
    add( BorderLayout.CENTER, hinweis );
    add( BorderLayout.SOUTH,  ausgabe );
    eingabe.addActionListener(
      new ActionListener() {
        public void actionPerformed( ActionEvent ev ) {
          meineMethode(); } } );
    addWindowListener(
      new WindowAdapter() {
        public void windowClosing( WindowEvent ev ) {
          dispose();
          System.exit( 0 ); } } );
  }

  void meineMethode()
  {
    ausgabe.setText( "Der eingelesene Text lautet: " + eingabe.getText() );
  }
}