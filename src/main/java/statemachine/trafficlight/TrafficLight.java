package statemachine.trafficlight;

public enum TrafficLight {

    RED_YELLOW {
        TrafficLight next() {
            return TrafficLight.GREEN;
        }
    },

    GREEN {
        TrafficLight next() {
            return TrafficLight.YELLOW;
        }
    },

    YELLOW {
        TrafficLight next() {
            return TrafficLight.RED;
        }
    },

    RED {
        TrafficLight next() {
            return TrafficLight.RED_YELLOW;
        }
    };

    abstract TrafficLight next();
}
