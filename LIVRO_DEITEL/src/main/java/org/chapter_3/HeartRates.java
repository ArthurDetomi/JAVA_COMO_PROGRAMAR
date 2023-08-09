package org.chapter_3;

import java.time.LocalDate;

public class HeartRates {

    private final int MAX_HEART_RATE_CONSTANT = 220;
    private final int HEART_RATE_TARGET = 50;
    private String nome;
    private String sobrenome;
    private Date dateOfBirth;

    public HeartRates() {

    }

    public HeartRates(String nome, String sobrenome, Date date) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dateOfBirth = date;
    }
    
    @Override
    public String toString() {
        return "HeartRates{\n" +
                "nome='" + nome + '\'' + "\n" +
                ", sobrenome='" + sobrenome + '\'' + "\n" +
                ", dateOfBirth=" + dateOfBirth.toString() + "\n" +
                ", maxHeartRate=" + calculateMaxHeartRate() + "\n" +
                ", TargetHeartRate=" + calculateTargetHeartRateInterval() + "\n" +
                '}';
    }

    public int calculateAge() {
        LocalDate currentDate = LocalDate.now();
        int yearsOld = currentDate.getYear() - dateOfBirth.getYear();

        if (dateOfBirth.getMonth() > currentDate.getMonthValue()) {
            yearsOld--;
        } else if (dateOfBirth.getMonth() == currentDate.getMonthValue() &&
                dateOfBirth.getDay() > currentDate.getDayOfMonth()) {
            yearsOld--;
        }

        return yearsOld;
    }


    public int calculateMaxHeartRate() {
        return MAX_HEART_RATE_CONSTANT - calculateAge();
    }

    public String calculateTargetHeartRateInterval() {
        int maxRate = calculateMaxHeartRate();
        double minimumRate = maxRate * 0.50;
        double maximumRate = maxRate * 0.85;
        return String.format(" %.2f - %.2f", minimumRate, maximumRate);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
