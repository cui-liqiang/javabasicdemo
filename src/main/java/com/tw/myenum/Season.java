package com.tw.myenum;

public enum Season {
    SPRING {
        @Override
        String weather() {
            return "warm";
        }
    },
    SUMMER {
        @Override
        String weather() {
            return "hot";
        }
    },
    FALL {
        @Override
        String weather() {
            return "cool";
        }
    },
    WINTER() {
        @Override
        String weather() {
            return "cold";
        }
    };

    abstract String weather();
}
