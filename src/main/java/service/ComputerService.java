package service;

import io.grpc.stub.StreamObserver;
import org.xproce.labs.Computer;
import org.xproce.labs.ComputerServiceGrpc;

public class ComputerService extends ComputerServiceGrpc.ComputerServiceImplBase {

    @Override
    public void addComputer(Computer.ComputerRequest request,
                            StreamObserver<Computer.ComputerResponse> responseObserver) {
        String name = request.getName();
        String caracteriques = request.getCaracterique();
        double price = request.getPrice();

        //ComputerRepository -> save() ->   id

        int id = 12345;


        Computer.ComputerResponse response = Computer.ComputerResponse.newBuilder()
                .setId(id)
                .setName(name)
                .setCaracterique(caracteriques)
                .setPrice(price)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
