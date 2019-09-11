package com.example.algorithm.designmode.abstractfactory;

/**
 * @author Jony-Liu
 */
public interface HumanFactory {
    /**
     * createYellowHuman
     *
     * @return
     */
    Human createYellowHuman();

    /**
     * createWhiteHuman
     *
     * @return
     */
    Human createWhiteHuman();

    /**
     * createBlackHuman
     *
     * @return
     */
    Human createBlackHuman();
}
