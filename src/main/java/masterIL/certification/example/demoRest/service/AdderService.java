package masterIL.certification.example.demoRest.service;

import org.springframework.stereotype.Service;

@Service
public class AdderService {

    private int num = 10;

    public void baseNum(int base) {
        this.num = base;
    }

    public int currentBase() {
        return num;
    }

    public int add(int adder) {
        return this.num + adder;
    }

    public int sub(int adder) {
        return this.num - adder;
    }

    public int mult(int adder) {
        return this.num * adder;
    }

    public int div(int adder) {
        return this.num / adder;
    }

    public int accumulate(int adder) {
        return this.num += adder;
    }
}