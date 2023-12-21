package com.example.lost_and_found.data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Name;
    private String Note;

    @ManyToOne
    @JoinColumn(name = "LocationId")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "StatusId")
    private Status status;

    @OneToOne
    @JoinColumn(name = "ContactInfoId")
    private ContactInfo contactInfo;

    @ManyToOne
    @JoinColumn(name = "UserId")
    private LAFUser lafUser;

    @ManyToOne
    @JoinColumn(name = "KeywordId")
    private Keyword keyword;
}
