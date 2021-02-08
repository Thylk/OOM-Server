package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class RemoteImpl extends UnicastRemoteObject implements IRemote{
    public RemoteImpl() throws RemoteException {
    }

    @Override
    public int average(int a, int b) throws RemoteException {
        return (a+b)/2;
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello Everyone";
    }
}
