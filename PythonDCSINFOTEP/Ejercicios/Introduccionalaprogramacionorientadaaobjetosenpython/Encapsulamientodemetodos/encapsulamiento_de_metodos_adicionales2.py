""" Métodos públicos y privados

Crea una clase CuentaBancaria con los siguientes atributos privados: __saldo y __titular. Implementa un método público llamado depositar() que aumente el saldo y otro método público llamado retirar() que disminuya el saldo. Además, implementa un método privado __calcular_comision() que calcule una comisión de 1% al retirar dinero. Asegúrate de que el saldo nunca se vuelva negativo.
"""

class CuentaBancaria:
    def __init__(self, titular, saldo=0):
        self.__titular = titular
        self.__saldo = saldo

    def depositar(self, monto):
        if monto > 0:
            self.__saldo += monto
            print(f"Se ha depositado {monto}. Nuevo saldo: {self.__saldo}")
        else:
            print("Error: El monto a depositar debe ser mayor a 0.")

    def retirar(self, monto):
        if monto > 0:
            comision = self.__calcular_comision(monto)
            total_retiro = monto + comision
            if total_retiro <= self.__saldo:
                self.__saldo -= total_retiro
                print(f"Se ha retirado {monto} de su cuenta. Comisión: {comision}. Nuevo saldo: {self.__saldo}.")
            else:
                print(f"Error: Usted no cuenta con saldo suficiente para realizar el retiro")
        else:
            print(f"Error: El monto a retirar deber ser mayor a 0.")

    def __calcular_comision(self, monto):
        return monto * 0.01
    
    def consultar_saldo(self):
        return self.__saldo
    
cuenta = CuentaBancaria("Jeiron Espinal", 50000)

cuenta.depositar(10000)
cuenta.retirar(20000)
print(f"Saldo actual: {cuenta.consultar_saldo()}.") 

cuenta.retirar(50000)