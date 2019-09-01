public interface Selectable{

      public boolean getSelected();
      
      public void setSelected( boolean sel );
      
      public Shape contains( int x, int y );
}