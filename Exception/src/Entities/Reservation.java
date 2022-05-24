package Entities;

import Model.Exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
                                                                        //boa prática
    public Reservation(Integer roomNumber, Date checkIn, Date checkout) throws DomainException {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckout() {
        return checkout;
    }

    public long duration() {
        long dif = checkout.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkout) throws DomainException{
        Date now = new Date();
        if (checkIn.before(now) || checkout.before(now)) {
            //erro no argumento do método
            throw new DomainException("Error in reservation, dates for update must be future");
        }
        if (!checkout.after(checkIn)) {
            throw new DomainException("Error in reservation, dates for update must be future");
        }
//        else{
//            reservation.updateDates(checkIn, checkout);
//            System.out.println("Reservation: " + reservation);
//        }
        this.checkIn = checkIn;
        this.checkout = checkout;
    }



    @Override
    public String toString() {
        return "Reservation{" +
                "Room: " + roomNumber +
                ", checkIn: " + sdf.format(checkIn) +
                ", checkout: " + sdf.format(checkout) +
                ", " + duration() + " nights";
    }
}
