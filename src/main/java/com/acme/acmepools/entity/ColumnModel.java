/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.acme.acmepools.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

/**
 *
 * @author Juneau
 */
@Data
@Entity
@Table(name = "COLUMN_MODEL")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ColumnModel.findAll", query = "SELECT c FROM ColumnModel c"),
    @NamedQuery(name = "ColumnModel.findById", query = "SELECT c FROM ColumnModel c WHERE c.id = :id"),
    @NamedQuery(name = "ColumnModel.findByColumnName", query = "SELECT c FROM ColumnModel c WHERE c.columnName = :columnName"),
    @NamedQuery(name = "ColumnModel.findByColumnLabel", query = "SELECT c FROM ColumnModel c WHERE c.columnLabel = :columnLabel")})
public class ColumnModel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 30)
    @Column(name = "COLUMN_NAME")
    private String columnName;
    @Size(max = 150)
    @Column(name = "COLUMN_LABEL")
    private String columnLabel;

}