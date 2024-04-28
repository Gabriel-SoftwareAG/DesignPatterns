from LevelOneSupport import LevelOneSupport
from LevelTwoSupport import LevelTwoSupport
from SupportTicket import SupportTicket

def main():
    levelOne = LevelOneSupport()
    levelTwo = LevelTwoSupport()

    levelOne.set_next(levelTwo)

    ticket = SupportTicket(1, "Cannot connect to the internet.")
    levelOne.handle_request(ticket)

    anotherTicket = SupportTicket(2, "Computer does not start.")
    levelOne.handle_request(anotherTicket)

if __name__ == "__main__":
    main()
