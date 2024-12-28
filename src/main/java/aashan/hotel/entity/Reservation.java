package aashan.hotel.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private int id;

    @Column(name = "reservation_room")
    private String room;

    @Column(name = "reservation_price")
    private Integer price;
    @Column(name = "reservation_num_of_rooms")
    private Integer rooms;

    @Column(name = "reservation_num_of_persons")
    private Integer persons;

    @Column(name = "reservation_num_of_children")
    private Integer children;

    @Column(name = "reservation_open_buffet")
    private String openBuffet;

    @Column(name = "reservation_from_date")
    private Date arrivalDate;

    @Column(name = "reservation_stay_days")
    private Integer stayDays;

    @ManyToOne
    @JoinColumn(name = "reservation_user_id", referencedColumnName = "user_id", insertable = false, updatable = false)
    private User user;

    // Default constructor
    public Reservation() {
    }

    // Constructor with fields
    public Reservation(String room, Integer price, Integer rooms, Integer persons, Integer children, String openBuffet,
            Date arrivalDate, Integer stayDays) {
        this.room = room;
        this.price = price;
        this.rooms = rooms;
        this.persons = persons;
        this.children = children;
        this.openBuffet = openBuffet;
        this.arrivalDate = arrivalDate;
        this.stayDays = stayDays;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getRooms() {
        return rooms;
    }

    public void setRooms(Integer rooms) {
        this.rooms = rooms;
    }

    public Integer getPersons() {
        return persons;
    }

    public void setPersons(Integer persons) {
        this.persons = persons;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

    public String getOpenBuffet() {
        return openBuffet;
    }

    public void setOpenBuffet(String openBuffet) {
        this.openBuffet = openBuffet;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Integer getStayDays() {
        return stayDays;
    }

    public void setStayDays(Integer stayDays) {
        this.stayDays = stayDays;
    }

    
    
    
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}




}
