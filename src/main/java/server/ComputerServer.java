package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.ComputerService;

import java.io.IOException;

public class ComputerServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(9090)
                .addService(new ComputerService())
                .build();

        server.start();
        server.awaitTermination();
    }
}
