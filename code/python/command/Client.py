from Receiver import Receiver
from PreparePizzaCommand import PreparePizzaCommand
from ServePastaCommand import ServePastaCommand
from Waiter import Waiter

def main():
    chef = Receiver()

    prepare_pizza_command = PreparePizzaCommand(chef)
    serve_pasta_command = ServePastaCommand(chef)

    waiter = Waiter()

    waiter.set_command(prepare_pizza_command)
    waiter.execute_command()

    waiter.set_command(serve_pasta_command)
    waiter.execute_command()

if __name__ == "__main__":
    main()
