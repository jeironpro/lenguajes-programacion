""" Encapsulamiento en una clase de cuenta bancaria

· Crea una clase CuentaBancaria que tenga los siguientes atributos privados:
    · titular (nombre del titular de la cuenta)
    · saldo

· Implementa los métodos getter y setter para los atributos.

· Añade un método depositar() que permita añadir dinero a la cuenta, pero solo si el monto es positivo.

· Añade un método retirar() que permita retirar dinero de la cuenta, pero solo si el saldo es suficiente.
"""

class CuentaBancaria:
    def __init__(self, titular, saldo=0):
        self.__titular = titular
        self.__saldo = saldo

    def get_titular(self):
        return self.__titular
    
    def set_titular(self, titular):
        self.__titular = titular
    
    def get_saldo(self):
        return self.__saldo
    
    def set_saldo(self, saldo):
        self.__saldo = saldo

    def depositar(self, monto):
        if monto > 0:
            self.__saldo += monto
            print(f"Se ha depositado {monto}. Nuevo saldo: {self.__saldo}")
        else:
            print("Error: El monto a depositar debe ser mayor a 0.")
    
    def retirar(self, monto):
        if monto > 0:
            if self.__saldo >= monto:
                self.__saldo -= monto
                print(f"{self.__titular}, usted ha retirado {monto} de su cuenta. Nuevo saldo: {self.__saldo}.")
            else:
                print(f"Error: {self.__titular}, usted no cuenta con saldo suficiente para realizar el retiro")
        else:
            print(f"Error: El monto a retirar deber ser mayor a 0.")

cuenta = CuentaBancaria("Jeiron Espinal", 50000)

print(f"Titular: {cuenta.get_titular()}. Saldo: {cuenta.get_saldo()}")

cuenta.depositar(10000)

cuenta.depositar(0)

cuenta.retirar(30000)

cuenta.retirar(40000)

cuenta.retirar(0)