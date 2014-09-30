package exception;

public class NoEntryArrivalStationException extends Exception
{
  private static final long serialVersionUID = 10L;

  public NoEntryArrivalStationException()
  {
  }

  public NoEntryArrivalStationException(String message)
  {
    super(message);
  }
}