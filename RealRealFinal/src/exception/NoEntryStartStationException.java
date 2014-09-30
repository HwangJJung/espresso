package exception;

public class NoEntryStartStationException extends Exception
{
  private static final long serialVersionUID = 11L;

  public NoEntryStartStationException()
  {
  }

  public NoEntryStartStationException(String message)
  {
    super(message);
  }
}