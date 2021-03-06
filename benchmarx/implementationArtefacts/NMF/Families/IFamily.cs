//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.42000
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

using NMF.Collections.Generic;
using NMF.Collections.ObjectModel;
using NMF.Expressions;
using NMF.Expressions.Linq;
using NMF.Models;
using NMF.Models.Collections;
using NMF.Models.Expressions;
using NMF.Models.Meta;
using NMF.Models.Repository;
using NMF.Serialization;
using NMF.Utilities;
using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Collections.Specialized;
using System.ComponentModel;
using System.Diagnostics;
using System.Linq;

namespace TTC2017.FamiliesToPersons.NMF.Families
{
    
    
    /// <summary>
    /// The public interface for Family
    /// </summary>
    [DefaultImplementationTypeAttribute(typeof(Family))]
    [XmlDefaultImplementationTypeAttribute(typeof(Family))]
    public interface IFamily : IModelElement
    {
        
        /// <summary>
        /// The name property
        /// </summary>
        string Name
        {
            get;
            set;
        }
        
        /// <summary>
        /// The father property
        /// </summary>
        IFamilyMember Father
        {
            get;
            set;
        }
        
        /// <summary>
        /// The mother property
        /// </summary>
        IFamilyMember Mother
        {
            get;
            set;
        }
        
        /// <summary>
        /// The sons property
        /// </summary>
        IOrderedSetExpression<IFamilyMember> Sons
        {
            get;
        }
        
        /// <summary>
        /// The daughters property
        /// </summary>
        IOrderedSetExpression<IFamilyMember> Daughters
        {
            get;
        }
        
        /// <summary>
        /// The familiesInverse property
        /// </summary>
        IFamilyRegister FamiliesInverse
        {
            get;
            set;
        }
        
        /// <summary>
        /// Gets fired before the Name property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NameChanging;
        
        /// <summary>
        /// Gets fired when the Name property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> NameChanged;
        
        /// <summary>
        /// Gets fired before the Father property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FatherChanging;
        
        /// <summary>
        /// Gets fired when the Father property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FatherChanged;
        
        /// <summary>
        /// Gets fired before the Mother property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MotherChanging;
        
        /// <summary>
        /// Gets fired when the Mother property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> MotherChanged;
        
        /// <summary>
        /// Gets fired before the FamiliesInverse property changes its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FamiliesInverseChanging;
        
        /// <summary>
        /// Gets fired when the FamiliesInverse property changed its value
        /// </summary>
        event System.EventHandler<ValueChangedEventArgs> FamiliesInverseChanged;
    }
}

