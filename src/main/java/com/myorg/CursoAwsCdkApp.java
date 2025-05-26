package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class CursoAwsCdkApp {
    public static void main(final String[] args) {
        App app = new App();

        final VpcStack vpcStack = new VpcStack(app, "Vpc");
        final ClusterStack cluster = new ClusterStack(app, "Cluster", vpcStack.getVpc());
        cluster.addDependency(vpcStack);
        app.synth();
    }
}

