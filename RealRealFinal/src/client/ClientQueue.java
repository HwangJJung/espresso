package client;

public class ClientQueue extends AbstractClientQueue
{
  public void initialize()
  {
    add(new Client("고객0", 1, 14, "Seoul", "Gwangju"));
    add(new Client("고객0", 2, 14, "Seoul", "Gwangju"));
    add(new Client("고객0", 3, 14, "Seoul", "Gwangju"));
    add(new Client("고객0", 4, 14, "Seoul", "Gwangju"));
    add(new Client("고객0", 10, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 16, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 13, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 12, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 14, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 13, 4, "Seoul", "Gwangju"));
    add(new Client("고객0", 15, 4, "Wonju", "Gwangju"));

    timerStart();
  }
}